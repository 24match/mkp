import request from '@/utils/request'

export function fetchAccount() {
  return request({
    url: '/mkp/api/selectAccount',
    method: 'get',
    baseURL: 'http://localhost:8080/'
  })
}

