package org.demo.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");

        // Llamamos al metodo importe con Iva
        double importeConIva = invoiceBean.dameImporteConIva();
        // Guardar el importe con IVA en el ActionContext para que esté disponible en la próxima página JSP
        ActionContext.getContext().put("importeConIva", importeConIva);

        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if (invoiceBean.getDateFrom() == null){
            addFieldError("invoiceBean.dateFrom","La fecha es obligatoria. ");
        }
        if (invoiceBean.getDateTo() == null){
            addFieldError("invoiceBean.dateTo","La fecha es obligatoria. ");
        }
        else if (invoiceBean.getDateFrom() != null && invoiceBean.getDateTo().before(invoiceBean.getDateFrom())) {
            addFieldError("invoiceBean.dateTo", "La fecha final debe ser mayor que la fecha inicial.");
        }
        if (invoiceBean.getCantidad() <= 0){
            addFieldError("invoiceBean.cantidad","El importe tiene que ser positivo y superior a 0");
        }
    }
}
