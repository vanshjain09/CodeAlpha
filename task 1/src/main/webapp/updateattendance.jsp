<!DOCTYPE html>
<html>
<head>
    <title>Update Attendance</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }
        .container {
            text-align: center;
            padding: 100px;
        }
        h2 {
            color: #007bff;
            font-size: 28px;
            margin-bottom: 20px;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        select, input[type="date"], input[type="text"], label {
            display: block;
            margin: 10px 0;
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            font-size: 14px;
        }
        label {
            font-weight: bold;
        }
        input[type="checkbox"] {
            vertical-align: middle;
            margin-right: 5px;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        a {
            display: block;
            margin-top: 10px;
            color: #007bff;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Update Attendance</h2>
        <form action="UpdateAttendanceServlet" method="post">
            <select name="course">
                <option value="DSA">DSA</option>
                <option value="Networking">Networking</option>
                <!-- Add more courses here -->
            </select>
            <input type="date" name="attendanceDate" placeholder="Class Date">
            <input type="text" name="studentRollNumber" placeholder="Student Roll Number">
            <label><input type="checkbox" name="isPresent"> Present</label>
            <input type="submit" value="Update Attendance">
        </form>
        <a href="home.jsp">Back to Home</a>
    </div>
</body>
</html>
