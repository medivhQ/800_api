package com.code.task.queue;


import com.code.task.AbstractLoanTask;
import com.code.task.JobQueue;

public class NoticeTaskLog extends AbstractLoanTask {
	public NoticeTaskLog(){
		super();
		task.setName("notice_log_task");
	}

	public void doLoan(){
//		JobQueue <NoticeLog> noticeQueue =JobQueue.getNoticeInstance();
//		while (!noticeQueue.isEmpty()) {
//			NoticeLog noticeLog = noticeQueue.peek();
//			if (noticeLog!=null) {
//				System.out.println(noticeLog.getContent());
//				//处理动作
//				noticeQueue.remove(noticeLog);
//			}
//		}
	}
}
