package cn.netdiscovery.http.core.response

import okhttp3.Response

/**
 *
 * @FileName:
 *          cn.netdiscovery.http.core.response.ResponseMapper
 * @author: Tony Shen
 * @date: 2020-10-05 01:34
 * @version: V1.0 Response 转换的接口
 */
interface ResponseMapper<out T> {
    fun map(response: Response): T
}

class StringResponseMapper : ResponseMapper<String> {
    override fun map(response: Response): String {
        return response.body?.string() ?: ""
    }
}

class EmptyResponseMapper : ResponseMapper<Response> {
    override fun map(response: Response): Response {
        return response
    }
}