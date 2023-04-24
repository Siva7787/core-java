package lambda_expressions;

public class emp
{
	int eid;
	String ename;
	int e_salery;
	public emp (int eid, String ename, int e_salery) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.e_salery = e_salery;
		
	}
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", e_salery=" + e_salery + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getE_salery() {
		return e_salery;
	}
	public void setE_salery(int e_salery) {
		this.e_salery = e_salery;
	}
	
	}
	
