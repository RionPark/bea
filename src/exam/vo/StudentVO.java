package exam.vo;

/*
 * VO : Value Object
 * DTO : Data Transper Object
 * Entity : database ORM JPA
 */
public class StudentVO {
	private Integer stNum;
	private String stName;
	private String stId;
	private String stPwd;
	private String stDesc;

	public Integer getStNum() {
		return stNum;
	}
	public void setStNum(Integer stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStId() {
		return stId;
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	public String getStPwd() {
		return stPwd;
	}
	public void setStPwd(String stPwd) {
		this.stPwd = stPwd;
	}
	public String getStDesc() {
		return stDesc;
	}
	public void setStDesc(String stDesc) {
		this.stDesc = stDesc;
	}
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stId=" + stId + ", stPwd=" + stPwd + ", stDesc="
				+ stDesc + "]";
	}
	
}
