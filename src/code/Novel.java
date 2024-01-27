class Novel {
    private final String Title;
    private final String AuthorName;
    private final String YearPublished;

    public Novel(final String Title,
                 final String AuthorName,
                 final String YearPublished)
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
    public String getYearPublished()
    {
        return YearPublished;
    }
}
