package com.basalt.toy.user;
/*
 * UserVo 생성 
 */
public class UserVo {
	
	    private Long uId; //아이디
	    private String email; //이메일
	    private String password; //패스워드
	    private String name; //닉네임
	    private int age; //나이

	    public Long getuId() {
	        return uId;
	    }

	    public void setuId(Long uId) {
	        this.uId = uId;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public String
	    toString() {
	        return "UserVo{" +
	                "uId=" + uId +
	                ", email='" + email + '\'' +
	                ", password='" + password + '\'' +
	                ", nickname='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }

}
