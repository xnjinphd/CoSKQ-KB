package edu.yonsei.icl.coskqkb;

import java.util.LinkedList;

import com.github.davidmoten.rtree.geometry.Geometries;
import com.github.davidmoten.rtree.geometry.Point;

public class ISCKTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point queryLocation = Geometries.point(40, 20);
		
		LinkedList<String> queryKeywords20 = 
				new LinkedList<String>();
		queryKeywords20.add("Saltlick");
		queryKeywords20.add("England");
		queryKeywords20.add("Raw");
		queryKeywords20.add("Honorable");
		queryKeywords20.add("Louise");
		queryKeywords20.add("Ray");
		queryKeywords20.add("Pedlar");
		queryKeywords20.add("Western");
		queryKeywords20.add("Jacks");
		queryKeywords20.add("Sanatorium");
		queryKeywords20.add("Kirk");
		queryKeywords20.add("Gans");
		queryKeywords20.add("Steele");
		queryKeywords20.add("Junion");
		queryKeywords20.add("Mellon");
		queryKeywords20.add("Battelle");
		queryKeywords20.add("Excellence");
		queryKeywords20.add("Downers");
		queryKeywords20.add("Ruthfred");
		queryKeywords20.add("Mylan");
		
		LinkedList<String> queryKeywords15 = 
				new LinkedList<String>();
		for(int i=0; i<15; i++) {
			queryKeywords15.add(queryKeywords20.get(i));
		}
		
		LinkedList<String> queryKeywords10 = 
				new LinkedList<String>();
		for(int i=0; i<10; i++) {
			queryKeywords10.add(queryKeywords20.get(i));
		}
		
		LinkedList<String> queryKeywords8 = 
				new LinkedList<String>();
		for(int i=0; i<8; i++) {
			queryKeywords8.add(queryKeywords20.get(i));
		}
				
		LinkedList<String> queryKeywords5 = 
				new LinkedList<String>();
		for(int i=0; i<5; i++) {
			queryKeywords5.add(queryKeywords20.get(i));
		}
				
		
		ISCK isck = new ISCK();
		
		System.out.println("Start reading data from yago...");
		long startLoadingDataTime = System.currentTimeMillis();
		isck.readDataFromYago();
        long finishLoadingDataTime = System.currentTimeMillis();
        long dataLoadingTime = 
        		finishLoadingDataTime - startLoadingDataTime;
		System.out.println("Finish reading data from yago,\n"
				+ "Data loading elapsed time is: "
				+ dataLoadingTime + " ms.");
		
		System.out.println("# of query keywords=5, and k=10");
		isck.kVG = isck.findTopkValidGroup(
				queryLocation, queryKeywords5, 10);
		System.out.println("average ranking score of kVG is: "
				+ isck.calculateAverageRankingScoreOfkVG());
		System.out.println("# of VG generation is: "
				+ isck.numberOfVGGeneration);
		System.out.println("# of VG ranking score calculation is: "
				+ isck.numberOfVGRSCalculation);
		System.out.println("# of the selected rsp_qd is: "
				+ isck.rspQdList.size());
		System.out.println("Number of result vg is: "
				+ isck.kVG.size());
		System.out.println(isck.kVG.toString());
		System.out.println();
		
		System.out.println("# of query keywords=8, and k=10");
		isck.kVG = isck.findTopkValidGroup(
				queryLocation, queryKeywords8, 10);
		System.out.println("average ranking score of kVG is: "
				+ isck.calculateAverageRankingScoreOfkVG());
		System.out.println("# of VG generation is: "
				+ isck.numberOfVGGeneration);
		System.out.println("# of VG ranking score calculation is: "
				+ isck.numberOfVGRSCalculation);
		System.out.println("# of the selected rsp_qd is: "
				+ isck.rspQdList.size());
		System.out.println("Number of result vg is: "
				+ isck.kVG.size());
		System.out.println(isck.kVG.toString());
		System.out.println();
		
		System.out.println("# of query keywords=10, and k=10");
		isck.kVG = isck.findTopkValidGroup(
				queryLocation, queryKeywords10, 10);
		System.out.println("average ranking score of kVG is: "
				+ isck.calculateAverageRankingScoreOfkVG());
		System.out.println("# of VG generation is: "
				+ isck.numberOfVGGeneration);
		System.out.println("# of VG ranking score calculation is: "
				+ isck.numberOfVGRSCalculation);
		System.out.println("# of the selected rsp_qd is: "
				+ isck.rspQdList.size());
		System.out.println("Number of result vg is: "
				+ isck.kVG.size());
		System.out.println(isck.kVG.toString());
		System.out.println();
		
		System.out.println("# of query keywords=15, and k=10");
		isck.kVG = isck.findTopkValidGroup(
				queryLocation, queryKeywords15, 10);
		System.out.println("average ranking score of kVG is: "
				+ isck.calculateAverageRankingScoreOfkVG());
		System.out.println("# of VG generation is: "
				+ isck.numberOfVGGeneration);
		System.out.println("# of VG ranking score calculation is: "
				+ isck.numberOfVGRSCalculation);
		System.out.println("# of the selected rsp_qd is: "
				+ isck.rspQdList.size());
		System.out.println("Number of result vg is: "
				+ isck.kVG.size());
		System.out.println(isck.kVG.toString());
		System.out.println();
		
		System.out.println("# of query keywords=20, and k=10");
		isck.kVG = isck.findTopkValidGroup(
				queryLocation, queryKeywords20, 10);
		System.out.println("average ranking score of kVG is: "
				+ isck.calculateAverageRankingScoreOfkVG());
		System.out.println("# of VG generation is: "
				+ isck.numberOfVGGeneration);
		System.out.println("# of VG ranking score calculation is: "
				+ isck.numberOfVGRSCalculation);
		System.out.println("# of the selected rsp_qd is: "
				+ isck.rspQdList.size());
		System.out.println("Number of result vg is: "
				+ isck.kVG.size());
		System.out.println(isck.kVG.toString());
		System.out.println();
		
		/*System.out.println("# of query keywords=10, and k=15");
		isck.kVG = isck.findTopkValidGroup(
				queryLocation, queryKeywords10, 15);
		System.out.println("average ranking score of kVG is: "
				+ isck.calculateAverageRankingScoreOfkVG());
		System.out.println("# of VG generation is: "
				+ isck.numberOfVGGeneration);
		System.out.println("# of VG ranking score calculation is: "
				+ isck.numberOfVGRSCalculation);
		System.out.println("Number of result vg is: "
				+ isck.kVG.size());
		System.out.println(isck.kVG.toString());
		System.out.println();
		
		System.out.println("# of query keywords=10, and k=20");
		isck.kVG = isck.findTopkValidGroup(
				queryLocation, queryKeywords10, 20);
		System.out.println("average ranking score of kVG is: "
				+ isck.calculateAverageRankingScoreOfkVG());
		System.out.println("# of VG generation is: "
				+ isck.numberOfVGGeneration);
		System.out.println("# of VG ranking score calculation is: "
				+ isck.numberOfVGRSCalculation);
		System.out.println("Number of result vg is: "
				+ isck.kVG.size());
		System.out.println(isck.kVG.toString());
		System.out.println();*/
		
	}

}