package Models.Entities;

import java.util.Objects;

public class Election {

    private String candidate;
    private Integer votesNumber;

    public Election(String candidate, Integer votesNumber) {
        this.candidate = candidate;
        this.votesNumber = votesNumber;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public Integer getVotesNumber() {
        return votesNumber;
    }

    public void setVotesNumber(Integer votesNumber) {
        this.votesNumber = votesNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Election election = (Election) o;

        return Objects.equals(votesNumber, election.votesNumber);
    }

    @Override
    public int hashCode() {
        return votesNumber != null ? votesNumber.hashCode() : 0;
    }
}

