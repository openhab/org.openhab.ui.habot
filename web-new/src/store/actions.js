export const initialLoad = (context) => {
  return context.dispatch('items/initialLoad')
    .then(() => {
      return context.dispatch('cards/initialLoad')
    })
}
