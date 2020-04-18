<template>
  <el-table
    ref="multipleTable"
    :data="account"
    tooltip-effect="dark"
    style="width: 100%"
    @selection-change="handleSelectionChange"
  >
    <el-table-column
      type="selection"
      width="55"
    />
    <el-table-column
      label="用户名"
      width="120"
      prop="username"
    />
    <el-table-column
      prop="password"
      label="密码"
      width="120"
    />
    <el-table-column
      prop="isadmin"
      label="权限"
      show-overflow-tooltip
    />
  </el-table>
</template>

<script>
import { fetchAccount } from '@/api/table'

export default {
  data() {
    return {
      account: null,
      multipleSelection: []
    }
  },
  created() {
    this.fetchAccount()
  },
  methods: {
    fetchAccount() {
      fetchAccount().then(response => {
        this.account = response.data.account
      })
    },
    toggleSelection(rows) {
      if (rows) {
        rows.forEach(row => {
          this.$refs.multipleTable.toggleRowSelection(row)
        })
      } else {
        this.$refs.multipleTable.clearSelection()
      }
    },
    handleSelectionChange(val) {
      this.multipleSelection = val
    }
  }
}
</script>
