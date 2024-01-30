class Novel {
    private final String Title;
    private final String AuthorName;
    private final int YearPublished;

    public Novel(final String Title,
                 final String AuthorName,
                 final int YearPublished)
    {
        this.AuthorName    = AuthorName;
        this.Title         = Title;
        this.YearPublished = YearPublished;
    }
    public String getTitle()
    {
        return Title;

    }
    public String getAuthorName()
    {
        return AuthorName;
    }
    public int getYearPublished()
    {
        return YearPublished;
    }
}
