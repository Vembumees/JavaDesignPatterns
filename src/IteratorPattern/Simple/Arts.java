package IteratorPattern.Simple;

 class Arts implements ISubjects{
    private String[] papers;

    public Arts()
    {
        papers = new String[] {
                "English",
                "History",
                "Geography",
                "Psychology"
        };
    }
     public IIterator createIterator()
     {
         return new ArtsIterator(papers);
     }


}
