package io.github.chis;

public class Piece{
    private String type;
    private boolean isWhite;
    public Piece(String type, boolean isWhite){
        this.type = type;
        this.isWhite = isWhite;
    }    public String getType(){
        return type;
    }
    public boolean isWhite(){
        return isWhite;
    }
}
