package com.woowa.notice.ui.noticedetail.contract.presenter

import com.woowa.notice.mapper.toUIModel
import com.woowa.notice.repository.NoticeDetailRepository
import com.woowa.notice.ui.noticedetail.contract.NoticeDetailContract

class NoticeDetailPresenter(
    private val view: NoticeDetailContract.View,
    private val repository: NoticeDetailRepository,
) : NoticeDetailContract.Presenter {

    override fun fetchNoticeDetail(id: Long) {
        repository.getNotice(
            id,
            onSuccess = { view.setNoticeDetail(it.toUIModel()) },
            onFailure = {},
        )
    }
}
