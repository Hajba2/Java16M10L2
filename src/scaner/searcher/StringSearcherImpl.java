package scaner.searcher;

public class StringSearcherImpl implements StringSearcher{
    @Override
    public boolean search(String strToSearchIn, String strToFind) {
        return strToSearchIn.toLowerCase().contains(strToFind.toLowerCase());
    }

    public static void main(String[] args) {
        String s = "hello this is Elelphant";
        StringSearcherImpl ssi = new StringSearcherImpl();
        System.out.println("ssi.search(s, \"hELLo\") = " + ssi.search(s, "hELLo"));
    }
}
