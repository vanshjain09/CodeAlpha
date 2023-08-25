<!DOCTYPE html>
<html>
<head>
    <title>View Attendance</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }
        .container {
            text-align: center;
            padding: 50px;
        }
        h2 {
            color: #007bff;
            font-size: 28px;
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #007bff;
            color: #fff;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
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
        <h2>View Attendance</h2>
        <!-- Create a form to specify course, date range, or student -->
        <table>
            <tr>
                <th>Roll Number</th>
                <th>Student Name</th>
                <th>DSA</th>
                <th>Networking</th>
                <th>Date</th>
            </tr>
            <!-- Loop through attendance records and display in rows -->
            <tr>
                <td>123</td>
                <td>John Doe</td>
                <td>Present</td>
                <td>Absent</td>
                <td>2023-08-25</td>
            </tr>
            <!-- Add more rows here -->
        </table>
        <a href="home.jsp">Back to Home</a>
    </div>
</body>
</html>
