package com.training;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
		
		List<Candidate> list = InterviewRepository.getCandidateList();

		//list candidate names from Pune city
		System.out.println("List of Pune Candidates:");
		List<Candidate> punecandidates=list.stream().filter(c->c.getCity().equals("Pune")).collect(Collectors.toList());
		System.out.println(punecandidates);

		//list city and count of candidates per city
		System.out.println("Candidate count per city");
		Map<String,Long> citiesCount=list.stream().collect(Collectors.groupingBy(Candidate::getCity,Collectors.counting()));
		System.out.println(citiesCount);
		
		//list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		Map<String,Long> tech= list.stream().collect(Collectors.groupingBy(Candidate::getTechnicalExpertise,
				Collectors.counting()));
		System.out.println(tech);
		
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		List<Candidate> freshers=list.stream().filter(c->c.getYearsOfExperience()==0).collect(Collectors.toList());
		System.out.println(freshers);
		
		//listing candidates with highest experience
		System.out.println("Sorted List of Candidates by Experience");
		
		Comparator<Candidate> expComparator = (c1,c2)->
			c1.getYearsOfExperience()<c2.getYearsOfExperience()?1:
				c1.getYearsOfExperience()>c2.getYearsOfExperience()?-1:0;
			
		List<Candidate> experience=list.stream().sorted(expComparator).collect(Collectors.toList());
		
		System.out.println(experience);

		//sort the candidates by city name
		printLine();
		System.out.println("Sorted List of Candidates by City Name");
		
		Comparator<Candidate> cityComparator = (c1,c2)->c1.getCity().compareTo(c2.getCity());
		
		List<Candidate> cities = list.stream().sorted(cityComparator).collect(Collectors.toList());
		
		System.out.println(cities);
		
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}

}
