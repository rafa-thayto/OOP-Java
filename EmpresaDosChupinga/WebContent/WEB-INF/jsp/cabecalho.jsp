<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<div class="container center">
	Data: <%= new SimpleDateFormat("dd/MM/yyyy").format(new Date()) %>
</div>

<div class="container center">
	Hora: <%= new SimpleDateFormat("hh:mm:ss").format(new Date()) %>
</div>

<hr>