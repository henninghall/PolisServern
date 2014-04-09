package gov.polisen.orm.models;

public class PermissionsOnCase extends PermissionsOnCaseKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissionsoncases.read
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    private Boolean read;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissionsoncases.adddata
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    private Boolean adddata;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissionsoncases.modify
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    private Boolean modify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissionsoncases.changepermissions
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    private Boolean changepermissions;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsoncases
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public PermissionsOnCase(Integer deviceid, Integer caseid, Integer userid, Boolean read, Boolean adddata, Boolean modify, Boolean changepermissions) {
        super(deviceid, caseid, userid);
        this.read = read;
        this.adddata = adddata;
        this.modify = modify;
        this.changepermissions = changepermissions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissionsoncases.read
     *
     * @return the value of permissionsoncases.read
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public Boolean getRead() {
        return read;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissionsoncases.adddata
     *
     * @return the value of permissionsoncases.adddata
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public Boolean getAdddata() {
        return adddata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissionsoncases.modify
     *
     * @return the value of permissionsoncases.modify
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public Boolean getModify() {
        return modify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissionsoncases.changepermissions
     *
     * @return the value of permissionsoncases.changepermissions
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public Boolean getChangepermissions() {
        return changepermissions;
    }
}