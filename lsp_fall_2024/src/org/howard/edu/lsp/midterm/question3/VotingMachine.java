package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

/**
 * A class that represents a voting machine for managing candidates and votes.
 */

public class VotingMachine {
    private HashMap<String, Integer> candidates = new HashMap<>();

    /**
     * Adds a candidate to the voting machine with an initial vote count of zero.
     *
     * @param name the name of the candidate to be added
     */
    public void addCandidate(String name) {
        candidates.put(name, 0); // Initialize with 0 votes
    }

    /**
     * Casts a vote for a specified candidate.
     *
     * @param name the name of the candidate for whom the vote is cast
     *             If the candidate does not exist, the vote is not counted.
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); // Increment the vote count
        }
    }

    /**
     * Returns a string representation of all candidates and their vote counts.
     *
     * @return a string containing the names of candidates and their respective votes
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String candidate : candidates.keySet()) {
            result.append(candidate).append(": ").append(candidates.get(candidate)).append(" votes\n");
        }
        return result.toString();
    }
}

//used chatGPT and Notebook LM to help with this question