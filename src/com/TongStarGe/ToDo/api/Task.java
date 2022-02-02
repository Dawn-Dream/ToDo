package com.TongStarGe.ToDo.api;

import java.util.ArrayList;
import java.util.Date;

public class Task {
    private static int TaskID;
    private static String TaskName , TaskInfo;
    private static ArrayList<String> ChildrenTask = new ArrayList<>();
    private static Date StartDate , EndDate;

    /**
     * 构造函数
     * @param id 任务ID
     * */
    public Task(int id) {
        TaskID = id;
    }

    /**
     * 设置任务名
     * @param taskName 任务名
     * */
    public static void setTaskName(String taskName) {
        TaskName = taskName;
        TaskInfo = "";
    }

    /**
     * 设置任务名、任务简要说明
     * @param taskName 任务名
     * @param taskInfo 任务简要说明
     * */
    public static void setTaskName(String taskName , String taskInfo){
        TaskName = taskName;
        TaskInfo = taskInfo;
    }

    /**
     * 添加子任务
     * @param taskName 子任务名
     * */
    public static void addChildrenTask(String taskName) {
        ChildrenTask.add(taskName);
    }

    /**
     * 设置任务开始时间
     * @param startDate 任务开始时间
     * */
    public static void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    /**
     * 设置任务结束时间
     * @param endDate 任务结束时间
     * */
    public static void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    /**
     * 获取任务名
     * @return String 任务名
     * */
    public static String getTaskName(){
        return TaskName;
    }

    /**
     * 获取任务简要说明
     * @return String 任务简要说明
     * */
    public static String getTaskInfo(){
        return TaskInfo;
    }

    /**
     * 获取子任务列表
     * @return ArrayList<String> 子任务列表
     * */
    public static ArrayList<String> getChildrenTaskList(){
        return ChildrenTask;
    }
}
