import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LoginView from "@/views/LoginView";
import UserPageView from "@/views/UserPageView";
import SignUpView from "@/views/SignUpView";
import EventView from "@/views/EventView";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/login',
    name: 'login',
    component: LoginView
  },
  {
    path: '/user-page',
    name: 'user-page',
    component: UserPageView
  },
  {
    path: '/signup',
    name: 'sign-up',
    component: SignUpView
  },
  {
    path: '/event',
    name: 'event',
    component: EventView
  },

]

const router = new VueRouter({
  routes
})

export default router
