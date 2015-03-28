<%@page import="sub.controller.UnitPatternController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%
   		//url 값
   		String path = request.getContextPath();
   		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
   		out.println(basePath);
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로또 예측</title>
</head>

<body>
		<form action="endNumber.do" method="get">
		${endList}
		<input type="submit" value="끝수 리턴" />
		</form> 
		<br><br>
		
		<form action="unitPriority.do" method="get">
			Unit 우선순위  <br><br>
			<c:forEach items="${unitPriority}" var="UnitStatsResultMap">
				${UnitStatsResultMap.unitId}
			</c:forEach>
		<input type="submit" value="Unit" />
		</form> 
		<br><br>
		
		<form action="updateUnitFrequency.do" method="get">
			번호 통계 (NUMERAL_STATS) 테이블에서 UNIT별 당첨 횟수 계산<br>
			-> 단위 (UNIT) 테이블에서 단위 별 출현횟수(UNIT_FREQUENCY) UPDATE<br>
			-> DB에서 업데이트<br><br>
			<input type="text" name="unitId" value="ex) A B C D E 중 하나 입력" />
			<input type="submit" value="Update" />
		</form>
		<br><br>
		
		<form action="selectWinningNumber.do">
			패턴 출현 횟수 UPDATE<br>
			-> DB에서 업데이트<br><br>
			<input type="submit" value="패턴 출현 횟수" />
		</form>
		<br><br>
		
		<form action="patternPriority.do">
			패턴 우선순위<br><br>
			<c:forEach items="${patternPriority}" var="UnitPatternResultMap">
				${UnitPatternResultMap.pattern} / 
			</c:forEach>
			<input type="submit" value="패턴" />
		</form>
		<br><br>
		
		<form action="numeralstatslist.do">
			번호 우선순위<br><br>
<%-- 			<c:forEach items="${read}" var="NumeralStatsResultMap">
				${NumeralStatsResultMap.numberId} / 
			</c:forEach> --%>
			<input type="text" value="번호입력" />
			<input type="submit" value="번호번호" />
			<br><br><br><br>
		</form>
	
</body>
</html>
