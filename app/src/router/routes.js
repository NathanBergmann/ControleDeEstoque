const routes = [
  {
    path: '/',
    redirect: '/home',
    component: () => import('layouts/MainLayout.vue'),
    children: [
      { path: '', component: () => import('pages/IndexPage.vue') },
      { path: '/addNewProduct', component: () => import('src/pages/AddNewProducts.vue') },
      { path: '/searchProduct', component: () => import('src/pages/SearchProducts.vue') },
      { path: '/registerOutput', component: () => import('src/pages/RegisterOutput.vue') },
      { path: '/registerEntry', component: () => import('src/pages/RegisterEntry.vue') }
    ]
  },
  // Always leave this as last one,
  // but you can also remove it
  {
    path: '/:catchAll(.*)*',
    component: () => import('pages/ErrorNotFound.vue')
  }
]

export default routes
