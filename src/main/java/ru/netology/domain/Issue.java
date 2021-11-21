package ru.netology.domain;

public class Issue {
    private int id;
    private int tag;
    private boolean openIssue; // если open - true, то задача открыта
    private boolean closeIssue; // если close - true, то задача закрыта
    private String author;
    private String label;
    private String textIssue;
    private String assignee; // на ком висит Issue сейчас

    public Issue() {
    }

    public Issue(int id, int tag, boolean openIssue, boolean closeIssue, String author, String label, String textIssue, String assignee) {
        this.id = id;
        this.tag = tag;
        this.openIssue = openIssue;
        this.closeIssue = closeIssue;
        this.author = author;
        this.label = label;
        this.textIssue = textIssue;
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public boolean isOpenIssue() {
        return openIssue;
    }

    public void setOpenIssue(boolean openIssue) {
        this.openIssue = openIssue;
    }

    public boolean isCloseIssue() {
        return closeIssue;
    }

    public void setCloseIssue(boolean closeIssue) {
        this.closeIssue = closeIssue;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTextIssue() {
        return textIssue;
    }

    public void setTextIssue(String textIssue) {
        this.textIssue = textIssue;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
}
