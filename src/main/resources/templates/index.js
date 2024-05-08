// You can also use ESM `import * as Sentry from "@sentry/node"` instead of `require`
const Sentry = require("@sentry/node");
import { nodeProfilingIntegration } from "@sentry/profiling-node";

Sentry.init({
  dsn: "https://33db932eb516ac4d26bbadb10000b380@o4507219231637504.ingest.us.sentry.io/4507219239960576",
  integrations: [
    nodeProfilingIntegration(),
  ],
  // Performance Monitoring
  tracesSampleRate: 1.0, //  Capture 100% of the transactions
  // Set sampling rate for profiling - this is relative to tracesSampleRate
  profilesSampleRate: 1.0,
});