package com.xxl.job.executor.service.report;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.memfactory.utils.HttpUtil;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;

@JobHandler(value = "GetImmuneSampleJobhandler")
@Component
public class GetImmuneSampleJobhandler extends IJobHandler {

	@Value("${xxl-job.dispatch.getImmuneSample}")
	private String getImmuneSample;

	@Override
	public ReturnT<String> execute(String param) throws Exception {
		HttpUtil.doGet(getImmuneSample);
		return SUCCESS;
	}

}
