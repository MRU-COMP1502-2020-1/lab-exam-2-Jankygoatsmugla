package lsystems;

public class A_A extends LRule{
    /**
     *
     * Returns the character which this rules matches
     *
     * @return the character the rule matches
     */
    @Override
    public char getMatch() {
        return 'A';
    }

    /**
     *
     * Returns the array of characters produced by the rule
     *
     * @return the array of characters produced
     */
    @Override
    public char[] getBody() {
        return new char[]{'A'};
    }
}
