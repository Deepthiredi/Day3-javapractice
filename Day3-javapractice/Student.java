
public class Student {
	private String sname;
	private int sid;
	private String sbranch;
	private long phno;
	Student(String sname,int sid,String sbranch,long phno)
	{
		this.sname=sname;
		this.sid=sid;
		this.sbranch=sbranch;
		this.phno=phno;
	}
	Student(int sid,String sbranch)
	{
		this.sid=sid;
		this.sbranch=sbranch;
	}
	
	public String getsname() {
		return sname;
	}
	public void setsname(String sname) {
		this.sname = sname;
	}
	public int getsid() {
		return sid;
	}
	public void setsid(int id) {
		this.sid = sid;
	}
	public String getsbranch() {
		return sbranch;
	}
	public void setsbranch(String branch) {
		this.sbranch = sbranch;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phn) {
		this.phno = phno;
	}
	

}
