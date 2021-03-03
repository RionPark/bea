package study.exam.vo;

public class StudentVO {
	private Integer stNum;
	private String stName;
	private String stId;
	private String stpwd;
	private String stDessc;
	
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
	public String getStpwd() {
		return stpwd;
	}
	public void setStpwd(String stpwd) {
		this.stpwd = stpwd;
	}
	public String getStDessc() {
		return stDessc;
	}
	public void setStDessc(String stDessc) {
		this.stDessc = stDessc;
	}
	
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stId=" + stId + ", stpwd=" + stpwd + ", stDessc="
				+ stDessc + "]";
	}
	
}
