import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			File file = new File("input.txt");
			Scanner scanner = new Scanner(file);

			int caseCount = 0;

			while (true) {
				int memoryCount = scanner.nextInt();
				int programCount = scanner.nextInt();

				if (memoryCount == 0 && programCount == 0) {
					break;
				}

				caseCount++;
				System.out.println("Case " + caseCount);

				Memory[] memoryList = new Memory[memoryCount];
				Program[] programList = new Program[programCount];

				for (int i = 0; i < memoryList.length; i++) {
					memoryList[i] = new Memory(i + 1, scanner.nextInt());
				}

				for (int i = 0; i < programList.length; i++) {
					int contestantCount = scanner.nextInt();
					Program[] contestantList = new Program[contestantCount];
					for (int j = 0; j < contestantList.length; j++) {
						contestantList[j] = new Program(i + 1, scanner.nextInt(), scanner.nextInt());
					}
					Program.sortByTime(contestantList);
					programList[i] = contestantList[0];
				}

				Program.sortByTime(programList);

				ProgramQueue sortedQueue = new ProgramQueue(programList.length);

				while (true) {
					boolean assignCompleted = true;
					for (int i = 0; i < memoryList.length; i++) {
						for (int j = 0; j < programList.length; j++) {
							if (programList[j].getMemoryIndex() < 0 && programList[j].getSize() <= memoryList[i].getSize()) {
								programList[j].setMemoryIndex(i);
								sortedQueue.insert(programList[j]);
								assignCompleted = false;
								break;
							}
						}
					}
					if (assignCompleted) {
						break;
					}
				}

				Message[] messages = new Message[programList.length];
				float cumulativeElapsedTime = 0;
				int messagesCount = 0;

				while (!sortedQueue.isEmpty()) {
						Program program = sortedQueue.remove();
						int memoryIndex = program.getMemoryIndex();
						int startTime = memoryList[memoryIndex].getElapsedTime();
						memoryList[memoryIndex].setElapsedTime(program.getTime() + memoryList[memoryIndex].getElapsedTime());
						int endTime = memoryList[memoryIndex].getElapsedTime();
						String message = String.format("Program %d runs in region %d from %d to %d",
								program.getId(), memoryList[memoryIndex].getId(), startTime, endTime);
						messages[messagesCount] = new Message(program.getId(), message);
						messagesCount++;
						cumulativeElapsedTime += endTime;
				}

				Message.sortById(messages);

				String averageText = String.format("Average turnaround time = %.2f", cumulativeElapsedTime / programList.length);

				System.out.println(averageText);
				for (int i = 0; i < messages.length; i++) {
					System.out.println(messages[i].getMessage());
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
