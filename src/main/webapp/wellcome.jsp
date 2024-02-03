<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

    <h1>Resumen de factura: </h1>
    <p>Concepto: <s:property value="invoiceBean.subject" /></p>
        <p>Fecha inicial: <s:property value="invoiceBean.dateFrom" /></p>
        <p>Fecha final: <s:property value="invoiceBean.dateTo" /></p>
        <p>Importe: <s:property value="invoiceBean.cantidad" /></p>
        <p>Importe con IVA: <s:property value="#importeConIva" /></p>
</body>
</html>