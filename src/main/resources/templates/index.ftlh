<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Other/html.html to edit this template
-->
<html>
    <head>
        <title>Task List</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <a href="newTask">Add new task</a>
        <h2>ToDo List</h2>

        <table>
            <tr>
                <td>Priority</td>
                <td>Description</td>
                <td>Date</td>
            </tr>

            <#list tasks as task>
                <tr>
                    <td>${task.priority}</td>
                    <td>${task.description}</td>
                    <td>${task.date}</td>
                    <td><a href="${'tasks/' + task.id}">Done</a></td>
                </tr>
            </#list>
        </table>
    </body>
</html>
