package com.example.streams1;

public class Painter {
    public String name;
    public String paintingStyle;
    public String theme;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPaintingStyle() {
        return paintingStyle;
    }
    public void setPaintingStyle(String paintingStyle) {
        this.paintingStyle = paintingStyle;
    }
    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public Painter(String name, String paintingStyle, String theme) {
        super();
        this.name = name;
        this.paintingStyle = paintingStyle;
        this.theme = theme;
    }
}