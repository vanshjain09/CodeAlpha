<!DOCTYPE html>
<html>
<head>
    <title>Attendance Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: url('background.jpg') no-repeat center center fixed;
            background-size: cover;
            background-color: #f2f2f2;
            color: #333;
        }
        .container {
            text-align: center;
            padding: 100px;
        }
        h1 {
            color: #007bff;
            font-size: 36px;
        }
        .btn-container {
            margin-top: 20px;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Attendance Management System</h1>
        <div class="btn-container">
            <a class="btn" href="registration.jsp">Register Student</a>
            <a class="btn" href="updateattendance.jsp">Update Attendance</a>
            <a class="btn" href="viewattendance.jsp">View Attendance</a>
        </div>
    </div>
</body>
</html>
