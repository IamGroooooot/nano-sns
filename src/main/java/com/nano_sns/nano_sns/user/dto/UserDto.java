package com.nano_sns.nano_sns.user.dto;

public class UserDto {
    private String id;
    private String username;
    private String fullName;
    private String bio;
    private String website;
    private String profilePicture;
    private Counts counts;

    public UserDto(String id, String username, String fullName, String bio, String website, String profilePicture, Counts counts) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.bio = bio;
        this.website = website;
        this.profilePicture = profilePicture;
        this.counts = counts;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBio() {
        return bio;
    }

    public String getWebsite() {
        return website;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public Counts getCounts() {
        return counts;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
    
    public void setCounts(Counts counts) {
        this.counts = counts;
    }

    public static class Counts {
        private int media;
        private int follows;
        private int followedBy;

        public Counts(int media, int follows, int followedBy) {
            this.media = media;
            this.follows = follows;
            this.followedBy = followedBy;
        }

        public int getMedia() {
            return media;
        }

        public int getFollows() {
            return follows;
        }

        public int getFollowedBy() {
            return followedBy;
        }

        public void setMedia(int media) {
            this.media = media;
        }

        public void setFollows(int follows) {
            this.follows = follows;
        }

        public void setFollowedBy(int followedBy) {
            this.followedBy = followedBy;
        }
    }
}