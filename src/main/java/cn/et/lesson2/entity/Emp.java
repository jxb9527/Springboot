package cn.et.lesson2.entity;

public class Emp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.eid
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    private Integer eid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.ename
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    private String ename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.esal
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    private Long esal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.did
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    private Integer did;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.eid
     *
     * @return the value of emp.eid
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.eid
     *
     * @param eid the value for emp.eid
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.ename
     *
     * @return the value of emp.ename
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.ename
     *
     * @param ename the value for emp.ename
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.esal
     *
     * @return the value of emp.esal
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    public Long getEsal() {
        return esal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.esal
     *
     * @param esal the value for emp.esal
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    public void setEsal(Long esal) {
        this.esal = esal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.did
     *
     * @return the value of emp.did
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.did
     *
     * @param did the value for emp.did
     *
     * @mbg.generated Wed Dec 13 11:24:30 CST 2017
     */
    public void setDid(Integer did) {
        this.did = did;
    }
}