package com.yzf.mvnbook.helloworld;

import java.util.Date;

public class JobRecord {
    protected Long id;

    protected Long jobConfId;
    protected Long upStreamJobRecordId;
    protected Long pipelineRecordId;
    protected String name;
    protected PluginType pluginType;

    protected Long pluginBuildId;
    protected PipelineJobStatus jobStatus;


    protected String inParams;


    protected String outParams;
    protected String triggerUser;

    protected TriggerMode triggerMode;
    // 任务发起时间
    protected Date triggerTime;
    // 插件开始执行的时间
    protected Date startTime;
    // 结束时间
    protected Date endTime;
}
