<template>
  <div class="app-container">
    <el-table
      v-loading="listLoading"
      :data="account"
      element-loading-text="Loading"
      border
      fit
      highlight-current-row
    >
      <el-table-column
        type="selection"
        width="55"
      />
      <el-table-column
        label="ID"
        width="60"
        prop="id"
      />
      <el-table-column
        label="用户名"
        prop="username"
      />
      <el-table-column
        label="密码"
        prop="password"
        width="120"
      />
      <el-table-column
        prop="isadmin"
        label="权限"
      />
      <el-table-column
        prop="key"
        label="密钥"
      />
      <el-table-column
        prop="createDate"
        label="修改日期"
      />
      <el-table-column
        align="right">
        <template slot="header">
          <el-inputz
            v-model="search"
            size="mini"
            placeholder="输入关键字搜索"/>
        </template>
        <template slot-scope="scope">
          <el-button
            size="mini"
            @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import { fetchAccount } from '@/api/table'

export default {
  filters: {
    statusFilter(status) {
      const statusMap = {
        published: 'success',
        draft: 'gray',
        deleted: 'danger'
      }
      return statusMap[status]
    }
  },
  data() {
    return {
      account: null,
      listLoading: true
    }
  },
  created() {
    this.fetchData()
  },
  methods: {
    // 获取表格数据
    fetchData() {
      this.listLoading = false
      fetchAccount().then(response => {
        this.account = response.data.account
        this.listLoading = false
      })
    },
    // 删除按钮
    handleDelete(row) {
      this.$confirm('请确定是否删除?', '确认信息', {
        distinguishCancelAndClose: true,
        confirmButtonText: '删除',
        cancelButtonClass: '取消'
      })
    }
  }
}
</script>
