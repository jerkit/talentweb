package net.togogo.talent.domain;

public class TbUser {
    private Integer userId;

    private String userEmail;

    private String userPassword;

    private String userName;

    private String userSex;

    private String userPhone;

    private String userPhoto;

    private String userBirthday;

    private String userWorkDate;

    private String userBornCity;

    private String userLivingCity;

    private Integer userState;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday == null ? null : userBirthday.trim();
    }

    public String getUserWorkDate() {
        return userWorkDate;
    }

    public void setUserWorkDate(String userWorkDate) {
        this.userWorkDate = userWorkDate == null ? null : userWorkDate.trim();
    }

    public String getUserBornCity() {
        return userBornCity;
    }

    public void setUserBornCity(String userBornCity) {
        this.userBornCity = userBornCity == null ? null : userBornCity.trim();
    }

    public String getUserLivingCity() {
        return userLivingCity;
    }

    public void setUserLivingCity(String userLivingCity) {
        this.userLivingCity = userLivingCity == null ? null : userLivingCity.trim();
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

	@Override
	public String toString() {
		return "TbUser [userId=" + userId + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userSex=" + userSex + ", userPhone=" + userPhone + ", userPhoto="
				+ userPhoto + ", userBirthday=" + userBirthday + ", userWorkDate=" + userWorkDate + ", userBornCity="
				+ userBornCity + ", userLivingCity=" + userLivingCity + ", userState=" + userState + "]";
	}
    
    
}