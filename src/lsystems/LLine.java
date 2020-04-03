package lsystems;

import java.util.*;

public class LLine {

	
	char[] line;
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		if(line.length == 0){
			throw new LSystemLengthException();
		}
		if(invalidChars()){
			throw new LSystemSymbolException();
		}


		Iterator<LRule> ruleIterator = rules.iterator();
		LRule currentRule;

		List<Character> output = new ArrayList<>();
		for(char c : line){
			output.add(c);
		}


		for(int i = 0; i < output.size(); i++){

			while(ruleIterator.hasNext()){
				currentRule = ruleIterator.next();

				if(output.get(i) == currentRule.getMatch()){
					char[] toAdd = currentRule.getBody();

					if(toAdd.length == 1){
						output.set(i, toAdd[0]);
					}
					else if(toAdd.length == 2){
						output.set(i, toAdd[0]);
						output.add(i+1, toAdd[1]);
					}
					else{
						output.remove(i);
					}


				}

			}

		}


		line = listToArray(output);


	}

	private boolean invalidChars() {
		Set<LRule> rules = getRules();

		for(LRule r : rules) {
			for (char c : line) {
				if (r.getMatch() != c) {
					return false;
				}
			}
		}

		return true;
	}

	private Set<LRule> getRules() {
		Set<LRule> rules = new HashSet<LRule>();
		rules.add(new A_A());
		rules.add(new A_AA());
		rules.add(new A_BC());
		rules.add(new A_Q());
		rules.add(new A_X());
		rules.add(new B_A());
		rules.add(new C_B());
		return rules;
	}


	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
