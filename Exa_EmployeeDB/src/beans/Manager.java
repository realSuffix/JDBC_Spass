/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author martin
 */
public class Manager {

    private String firstname;
    private String lastname;

    private LocalDate fromDate;
    private LocalDate toDate;

    public Manager(String firstname, String lastname, LocalDate fromDate, LocalDate toDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public static Manager fromSQLSet(ResultSet rs) throws SQLException {
        return new Manager(
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getDate("from_date").toLocalDate(),
                rs.getDate("to_date").toLocalDate()
        );
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    @Override
    public String toString() {
        return String.format("<strong>%s,&nbsp;&nbsp;&nbsp;%s</strong>&nbsp;&nbsp;&nbsp;<span style=\"color: red;\">%s to %s,</span>", 
                this.lastname, this.firstname, Employee.dtf.format(this.fromDate), Employee.dtf.format(this.toDate));
    }

}
