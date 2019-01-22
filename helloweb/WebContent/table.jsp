<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		int nRow = 1;
		if (row != null)
			nRow = Integer.parseInt(row);
		int nCol = 1;
		if (col != null)
			nCol = Integer.parseInt(col);
		//System.out.println(f)
	%>
	<table border="3px" cellspacing="0" cellpadding="5px">
		<%
			for (int i = 0; i < nRow; i++) {
		%>
		<tr>
			<%
				for (int j = 0; j < nCol; j++) {
			%>
			<td>col(<%=i%>,<%=j%>)
			</td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>