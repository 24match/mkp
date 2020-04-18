<template>
  <div class="app-container">
    <el-form ref="account" :model="account" label-width="100px">
      <el-form-item label="用户名">
        <el-input v-model="account.username" placeholder="请输入用户名" prop="username"/>
      </el-form-item>
      <el-form-item label="密码">
        <el-input v-model="account.password" placeholder="请输入密码" prop="password"/>
      </el-form-item>
      <el-form-item label="是否管理员">
        <el-switch v-model="account.isadmin" prop="isadmin"/>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">保存</el-button>
        <el-button @click="onRest">重设</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      account: {
        username: '',
        password: '',
        isadmin: false
      }
    }
  },
  methods: {
    onSubmit() {
      this.$message('表单提交')
    },
    onRest() {
      this.$refs.account.resetFields()
    }
  }
}
</script>

<style scoped>
  .line{
    text-align: center;
  }
</style>
