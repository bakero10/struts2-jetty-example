package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private Date dateFrom;
    private Date dateTo;
    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private int cantidad;
    public int getCantidad() {return cantidad; }
    public void setCantidad(int cantidad) {this.cantidad = cantidad; }

    public double dameImporteConIva() {
        double taxRate = 0.21; // Para hacer la cuenta del IVA del 21%
        return this.cantidad * (1 + taxRate);
    }
}
