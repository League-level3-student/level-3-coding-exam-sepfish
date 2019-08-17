import java.util.ArrayList;

public class VoteProcessor {
	String calculateElectionWinner(ArrayList<String> votes) {
		int popeVotes = 0;
		int edVotes = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
				popeVotes++;
			} else if (votes.get(i).equalsIgnoreCase("edward snowden")) {
				edVotes++;
			}
		}
		if (popeVotes < edVotes) {
			return "edward snowden";
		} else if (edVotes < popeVotes) {
			return "pope francis";
		} else {
			return "TIE";
		}
	}
}
