package com.ranzan.notifyadapter;

public class Box {
    private String text;
    private Boolean isClicked;

    public Box(String text, Boolean isClicked) {
        this.text = text;
        this.isClicked = isClicked;
    }

    public String getText() {
        return text;
    }

    public Boolean getIsClicked() {
        return isClicked;
    }

    public void setClicked(Boolean clicked) {
        isClicked = clicked;
    }
}
