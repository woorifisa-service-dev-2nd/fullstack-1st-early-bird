
const BASE_URL = `{process.env.REACT_APP_TEST_KEY}/api`;

export const searchUser = async (userName) => {
  const queryString = userName ? `?name=${userName}` : ``;

  const response = await fetch(`${BASE_URL}/users${queryString}`);
  return await response.json();
};