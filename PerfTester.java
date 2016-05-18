import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PerfTester {

	public static void main(String[] args) {

		// testMap();
		List<Integer> testKeys = initTestCases(100000);
		performanceTestAVL(testKeys);
		performanceTestHashMap(testKeys);
		performanceTestRBT(testKeys);

	}

	/**
	 * Used for testing a newly implemented Map Impl
	 */
	private static void testMap() {
		Map<Integer, String> testMap = new HashMapLinkedList<Integer, String>();
		testMap.put(Integer.valueOf(123), "def");
		testMap.put(Integer.valueOf(124), "decdsaf");
		testMap.put(Integer.valueOf(139), "defa");
		testMap.put(Integer.valueOf(155), "defa55");
		System.out.println(testMap.get(123));
		System.out.println(testMap.get(139));
		System.out.println(testMap.get(124));
		System.out.println(testMap.get(155));
	}

	/**
	 * Initializes test cases with random numbers as keys
	 * 
	 * @param count
	 * @return
	 */
	private static List<Integer> initTestCases(int count) {
		List<Integer> testKeysList = new ArrayList<Integer>();
		Random random = new Random();
		int num = 0;
		System.out.println("initTestCases::");
		for (int j = 0; j < count; j++) {
			num = random.nextInt();
			if (num < 0) {
				num = num * (-1);
			}
			testKeysList.add(num);
		}
		return testKeysList;
	}

	public static void performanceTestAVL(List<Integer> keysList) {

		System.out.println("---------AVL Implementation---------");
		int testCasesCount = keysList.size();
		long startTime = 0, endTime = 0;
		Date dateObj = new Date();

		startTime = dateObj.getTime();
		Map<Integer, String> testMap = new HashMapAVL<Integer, String>();
		Random random = new Random();
		for (Integer key : keysList) {
			testMap.put(key, "abc");
		}
		dateObj = new Date();
		endTime = dateObj.getTime();
		System.out.println("INSERT TIME::" + (endTime - startTime));

		dateObj = new Date();
		startTime = dateObj.getTime();
		Random randomObj = new Random();
		for (int i = 0; i < testCasesCount / 10; i++) {
			int searchIndex = randomObj.nextInt() % testCasesCount;
			if (searchIndex < 0) {
				searchIndex = searchIndex * (-1);
			}
			// System.out.println(keysList.get(searchIndex));
			testMap.get(keysList.get(searchIndex));
		}
		dateObj = new Date();
		endTime = dateObj.getTime();
		System.out.println("start time::" + startTime);
		System.out.println("end time::" + endTime);
		System.out.println("SEARCH TIME::" + (endTime - startTime));

	}

	public static void performanceTestHashMap(List<Integer> keysList) {

		System.out.println("---------HashMap Linked List Implementation---------");
		int testCasesCount = keysList.size();
		long startTime = 0, endTime = 0;
		Date dateObj = new Date();

		startTime = dateObj.getTime();
		Map<Integer, String> testMap = new HashMapLinkedList<Integer, String>();
		Random random = new Random();
		for (Integer key : keysList) {
			testMap.put(key, "abc");
		}
		dateObj = new Date();
		endTime = dateObj.getTime();
		System.out.println("INSERT TIME::" + (endTime - startTime));

		dateObj = new Date();
		startTime = dateObj.getTime();
		Random randomObj = new Random();
		for (int i = 0; i < testCasesCount / 10; i++) {
			int searchIndex = randomObj.nextInt() % testCasesCount;
			if (searchIndex < 0) {
				searchIndex = searchIndex * (-1);
			}
			// System.out.println(keysList.get(searchIndex));
			testMap.get(keysList.get(searchIndex));
		}
		dateObj = new Date();
		endTime = dateObj.getTime();
		System.out.println("start time::" + startTime);
		System.out.println("end time::" + endTime);
		System.out.println("SEARCH TIME::" + (endTime - startTime));

	}
	
	
	
	public static void performanceTestRBT(List<Integer> keysList) {
			System.out.println("---------RBT Implementation---------");
			int testCasesCount = keysList.size();
			long startTime = 0, endTime = 0;
			Date dateObj = new Date();

			startTime = dateObj.getTime();
			Map<Integer, String> testMap = new HashMapRBTree<Integer, String>();
			Random random = new Random();
			for (Integer key : keysList) {
				testMap.put(key, "abc");
			}
			dateObj = new Date();
			endTime = dateObj.getTime();
			System.out.println("INSERT TIME::" + (endTime - startTime));

			dateObj = new Date();
			startTime = dateObj.getTime();
			Random randomObj = new Random();
			for (int i = 0; i < testCasesCount / 10; i++) {
				int searchIndex = randomObj.nextInt() % testCasesCount;
				if (searchIndex < 0) {
					searchIndex = searchIndex * (-1);
				}
				// System.out.println(keysList.get(searchIndex));
				testMap.get(keysList.get(searchIndex));
			}
			dateObj = new Date();
			endTime = dateObj.getTime();
			System.out.println("start time::" + startTime);
			System.out.println("end time::" + endTime);
			System.out.println("SEARCH TIME::" + (endTime - startTime));

		}	
		
		
	}

