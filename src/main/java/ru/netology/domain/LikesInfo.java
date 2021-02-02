package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean whoLikes;
    private boolean canLike;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isWhoLikes() {
        return whoLikes;
    }

    public void setWhoLikes(boolean whoLikes) {
        this.whoLikes = whoLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }
}
